<%--
/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/article/init.jsp" %>

<%
String tabs2 = ParamUtil.getString(request, "tabs2", "general");
%>

<liferay-portlet:renderURL portletConfiguration="true" var="portletURL">
	<portlet:param name="tabs2" value="<%= tabs2 %>" />
</liferay-portlet:renderURL>

<liferay-ui:tabs
	names="general,display-settings,rss"
	param="tabs2"
	url="<%= portletURL %>"
/>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<aui:form action="<%= configurationURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
	<aui:input name="tabs2" type="hidden" value="<%= tabs2 %>" />
	<aui:input name="preferences--resourcePrimKey--" type="hidden" value="<%= resourcePrimKey %>" />

	<aui:fieldset>
		<c:choose>
			<c:when test='<%= tabs2.equals("general") %>'>
				<div class="kb-field-wrapper">
					<aui:field-wrapper label="article">

						<%
						Article article = null;

						try {
							article = ArticleLocalServiceUtil.getLatestArticle(resourcePrimKey, WorkflowConstants.STATUS_APPROVED);
						}
						catch (NoSuchArticleException e) {
						}
						%>

						<div id="<portlet:namespace />configurationArticle">
							<%= (article != null) ? article.getTitle() : StringPool.BLANK %>
						</div>

						<liferay-portlet:renderURL portletName="<%= portletResource %>" var="selectConfigurationArticleURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
							<portlet:param name="jspPage" value="/article/select_configuration_article.jsp" />
						</liferay-portlet:renderURL>

						<%
						String taglibOnClick = "var selectConfigurationArticleWindow = window.open('" + selectConfigurationArticleURL + "&" + PortalUtil.getPortletNamespace(portletResource) + "selResourcePrimKey=' + document." + renderResponse.getNamespace() + "fm." + renderResponse.getNamespace() + "resourcePrimKey.value, 'selectConfigurationArticle', 'directories=no,height=640,location=no,menubar=no,resizable=yes,scrollbars=yes,status=no,toolbar=no,width=680'); void(''); selectConfigurationArticleWindow.focus();";
						%>

						<div class="kb-edit-link">
							<aui:a href="javascript:;" onClick="<%= taglibOnClick %>"><liferay-ui:message key="select-article" /> &raquo;</aui:a>
						</div>
					</aui:field-wrapper>
				</div>
			</c:when>
			<c:when test='<%= tabs2.equals("display-settings") %>'>
				<aui:input label="enable-description" name="preferences--enableArticleDescription--" type="checkbox" value="<%= enableArticleDescription %>" />

				<aui:input label="enable-categories" name="preferences--enableArticleAssetCategories--" type="checkbox" value="<%= enableArticleAssetCategories %>" />

				<aui:input label="enable-tags" name="preferences--enableArticleAssetTags--" type="checkbox" value="<%= enableArticleAssetTags %>" />

				<aui:input label="enable-ratings" name="preferences--enableArticleRatings--" type="checkbox" value="<%= enableArticleRatings %>" />

				<aui:input label="enable-comments" name="preferences--enableArticleComments--" type="checkbox" value="<%= enableArticleComments %>" />

				<aui:input label="show-comments" name="preferences--showArticleComments--" type="checkbox" value="<%= showArticleComments %>" />

				<aui:input label="enable-view-count-increment" name="preferences--enableArticleViewCountIncrement--" type="checkbox" value="<%= enableArticleViewCountIncrement %>" />
			</c:when>
			<c:when test='<%= tabs2.equals("rss") %>'>
				<aui:select label="maximum-items-to-display" name="preferences--rssDelta--">
					<aui:option label="1" selected="<%= rssDelta == 1 %>" />
					<aui:option label="2" selected="<%= rssDelta == 2 %>" />
					<aui:option label="3" selected="<%= rssDelta == 3 %>" />
					<aui:option label="4" selected="<%= rssDelta == 4 %>" />
					<aui:option label="5" selected="<%= rssDelta == 5 %>" />
					<aui:option label="10" selected="<%= rssDelta == 10 %>" />
					<aui:option label="15" selected="<%= rssDelta == 15 %>" />
					<aui:option label="20" selected="<%= rssDelta == 20 %>" />
					<aui:option label="25" selected="<%= rssDelta == 25 %>" />
					<aui:option label="30" selected="<%= rssDelta == 30 %>" />
					<aui:option label="40" selected="<%= rssDelta == 40 %>" />
					<aui:option label="50" selected="<%= rssDelta == 50 %>" />
					<aui:option label="60" selected="<%= rssDelta == 60 %>" />
					<aui:option label="70" selected="<%= rssDelta == 70 %>" />
					<aui:option label="80" selected="<%= rssDelta == 80 %>" />
					<aui:option label="90" selected="<%= rssDelta == 90 %>" />
					<aui:option label="100" selected="<%= rssDelta == 100 %>" />
				</aui:select>

				<aui:select label="display-style" name="preferences--rssDisplayStyle--">
					<aui:option label="<%= RSSUtil.DISPLAY_STYLE_FULL_CONTENT %>" selected="<%= rssDisplayStyle.equals(RSSUtil.DISPLAY_STYLE_FULL_CONTENT) %>" />
					<aui:option label="<%= RSSUtil.DISPLAY_STYLE_ABSTRACT %>" selected="<%= rssDisplayStyle.equals(RSSUtil.DISPLAY_STYLE_ABSTRACT) %>" />
					<aui:option label="<%= RSSUtil.DISPLAY_STYLE_TITLE %>" selected="<%= rssDisplayStyle.equals(RSSUtil.DISPLAY_STYLE_TITLE) %>" />
				</aui:select>

				<aui:select label="format" name="preferences--rssFormat--">
					<aui:option label="RSS 1.0" selected='<%= rssFormat.equals("rss10") %>' value="rss10" />
					<aui:option label="RSS 2.0" selected='<%= rssFormat.equals("rss20") %>' value="rss20" />
					<aui:option label="Atom 1.0" selected='<%= rssFormat.equals("atom10") %>' value="atom10" />
				</aui:select>
			</c:when>
		</c:choose>

		<aui:button-row cssClass="kb-submit-buttons">
			<aui:button type="submit" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>

<c:if test='<%= tabs2.equals("general") %>'>
	<aui:script>
		function <portlet:namespace />selectConfigurationArticle(resourcePrimKey, title) {
			document.<portlet:namespace />fm.<portlet:namespace />resourcePrimKey.value = resourcePrimKey;
			document.getElementById("<portlet:namespace />configurationArticle").innerHTML = title;
		}
	</aui:script>
</c:if>