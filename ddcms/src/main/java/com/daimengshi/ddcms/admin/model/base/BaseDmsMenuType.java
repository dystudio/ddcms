package com.daimengshi.ddcms.admin.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDmsMenuType<M extends BaseDmsMenuType<M>> extends JbootModel<M> implements IBean {

    public static final String ACTION_ADD = "DmsMenuType:add";
    public static final String ACTION_DELETE = "DmsMenuType:delete";
    public static final String ACTION_UPDATE = "DmsMenuType:update";


    @Override
	public String addAction() {
        return ACTION_ADD;
    }

    @Override
	public String deleteAction() {
        return ACTION_DELETE;
    }

    @Override
	public String updateAction() {
        return ACTION_UPDATE;
    }


	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
