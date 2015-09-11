package com.publiccms.views.directive.log;

// Generated 2015-5-12 12:57:43 by SourceMaker

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.publiccms.logic.service.log.LogEmailCheckService;
import com.sanluan.common.base.BaseDirective;
import com.sanluan.common.handler.PageHandler;
import com.sanluan.common.handler.RenderHandler;

@Component
public class LogEmailCheckListDirective extends BaseDirective {

	@Override
	public void execute(RenderHandler handler) throws IOException, Exception {
		PageHandler page = service.getPage(handler.getInteger("userId"), handler.getDate("startCreateDate"), handler.getDate("endCreateDate"), 
				handler.getBoolean("checked"), 
				handler.getString("orderField"), handler.getString("orderType"), handler.getInteger("pageIndex",1), handler.getInteger("count",20));
		handler.put("page", page).render();
	}

	@Autowired
	private LogEmailCheckService service;

}