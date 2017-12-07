package com.daimengshi.ddcms.admin.controller;

import com.daimengshi.ddcms.admin.model.DmsMenu;
import com.daimengshi.ddcms.admin.service.impl.DmsMenuServiceImpl;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by zhoufeng on 2017/12/6.
 * 后台主页
 */
@RequestMapping("/admin")
public class AdminIndexController extends JbootController {
    private final static Logger logger = LoggerFactory.getLogger(AdminIndexController.class);

    @Inject
    private DmsMenuServiceImpl menuService;

    /**
     * 仪表盘
     */
    public void index() {
//        DmsMenu menu = new DmsMenu();
//        menu.setName("仪表盘");
//        menu.setCreateTime(new Date());
//        menu.setTypeId("1");
//        menu.setUrl("/admin");
//        menuService.save(menu);

        //获取菜单列表
        List<DmsMenu> menus = menuService.findAll();
        setAttr("menus", menus);


        setAttr("title", "仪表盘");
        setAttr("mainTP", "/htmls/admin/index/index.html");

        //调用通用模板
//        renderTemplate("/htmls/admin/global.html");
        renderJson(menus);

    }
}
