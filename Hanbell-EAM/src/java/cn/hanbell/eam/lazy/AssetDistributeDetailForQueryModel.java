/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.hanbell.eam.lazy;

import cn.hanbell.eam.control.UserManagedBean;
import cn.hanbell.eam.entity.AssetDistributeDetailForQuery;
import com.lightshell.comm.BaseLazyModel;
import com.lightshell.comm.SuperEJB;
import java.util.List;
import java.util.Map;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

/**
 *
 * @author C0160
 */
public class AssetDistributeDetailForQueryModel extends BaseLazyModel<AssetDistributeDetailForQuery> {

    private final UserManagedBean userManagedBean;

    public AssetDistributeDetailForQueryModel(SuperEJB superEJB, UserManagedBean userManagedBean) {
        this.superEJB = superEJB;
        this.userManagedBean = userManagedBean;
    }

    @Override
    public List<AssetDistributeDetailForQuery> load(int first, int pageSize, List<SortMeta> multiSortMeta, Map<String, Object> filters) {
        filterFields.put("company =", userManagedBean.getCompany());
        return super.load(first, pageSize, multiSortMeta, filters); 
    }

}
