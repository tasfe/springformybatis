<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

  <form:form modelAttribute="member">
    <table border="0" cellspacing="1" cellpadding="0" align="center">
  <tr>
    <td colspan="2">基本登录资料</td>
    
  </tr>
<tr>
    <td>所属地区</td>
    <td><form:select path="wProvince" cssStyle="width:100px;">
                    <form:option value="">请选择省份</form:option>
                    <form:options items="${prolist}" itemValue="provinceid" itemLabel="provinceName"/>
                    </form:select>
                   <form:select path="wCity" cssStyle="width:100px;">
                    <form:option value="">请选择城市</form:option>                    
                    </form:select>
                    <span class="required">* 必选</span>
                    <form:errors path="wProvince" cssClass="error" />  
                    <form:errors path="wCity" cssClass="error" />                    
                    </td>
  </tr>
  <tr>
    <td>用户名</td>
    <td><form:input path="memberName" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="memberName" cssClass="error" /> </td>
  </tr>
  <tr>
    <td>密码</td>
    <td><form:password path="memberPwd" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="memberPwd" cssClass="error" /> </td>
  </tr>
  
  <tr>
    <td>确认密码</td>
    <td><form:password path="memberconfirmPwd" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="memberconfirmPwd" cssClass="error" /> </td>
  </tr>
  
  <tr>
    <td colspan="2">姓名和联系方式</td>
    
  </tr>
  <tr>
    <td>真实姓名</td>
    <td><form:input path="memberRealname" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="memberRealname" cssClass="error" /> </td>
  </tr>
  <tr>
    <td>联系电话</td>
    <td><form:input path="memberTel" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="memberTel" cssClass="error" /> </td>
  </tr>
  <tr>
    <td>企业名称</td>
    <td><form:input path="memberCname" cssStyle="width:320px;" />
                       <form:errors path="memberCname" cssClass="error" /> </td>
  </tr>
  <tr>
    <td>QQ</td>
    <td><form:input path="memberQq" cssStyle="width:100px;" />
                       <form:errors path="memberQq" cssClass="error" /> </td>
  </tr>
  <tr>
    <td>Email</td>
    <td><form:input path="memberEmail" cssStyle="width:150px;" />
                       <form:errors path="memberEmail" cssClass="error" /> </td>
  </tr>
  <tr>
    <td>验证码</td>
    <td>
    <form:input path="checkcode" cssStyle="width:150px;" />
                                           <img src="/captcha-image" width="55" height="20" id="kaptchaImage"  style="margin-bottom: -3px"/>   
        
                                            <form:errors path="checkcode" cssClass="error" />
     </td>
  </tr>
  <tr>
    <td colspan="2" style="text-align:center;"><input type="submit" name="Button1" value="确定" /> &nbsp;

<input id="Reset1" class="button_bak" type="reset" value="重填" /></td>
    
  </tr>
  
</table>
</form:form>

