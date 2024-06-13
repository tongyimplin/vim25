package com.vmware.vim25;

import com.vmware.vim25.DVSMacLearningPolicy;
import com.vmware.vim25.InheritablePolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSMacLearningPolicy", propOrder = {"enabled", "allowUnicastFlooding", "limit", "limitPolicy"})
public class DVSMacLearningPolicy extends InheritablePolicy {
  protected boolean enabled;
  
  protected Boolean allowUnicastFlooding;
  
  protected Integer limit;
  
  protected String limitPolicy;
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public Boolean isAllowUnicastFlooding() {
    return this.allowUnicastFlooding;
  }
  
  public void setAllowUnicastFlooding(Boolean paramBoolean) {
    this.allowUnicastFlooding = paramBoolean;
  }
  
  public Integer getLimit() {
    return this.limit;
  }
  
  public void setLimit(Integer paramInteger) {
    this.limit = paramInteger;
  }
  
  public String getLimitPolicy() {
    return this.limitPolicy;
  }
  
  public void setLimitPolicy(String paramString) {
    this.limitPolicy = paramString;
  }
}
