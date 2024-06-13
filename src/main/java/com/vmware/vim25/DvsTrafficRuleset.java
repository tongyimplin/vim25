package com.vmware.vim25;

import com.vmware.vim25.DvsTrafficRule;
import com.vmware.vim25.DvsTrafficRuleset;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsTrafficRuleset", propOrder = {"key", "enabled", "precedence", "rules"})
public class DvsTrafficRuleset extends DynamicData {
  protected String key;
  
  protected Boolean enabled;
  
  protected Integer precedence;
  
  protected List<DvsTrafficRule> rules;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public Integer getPrecedence() {
    return this.precedence;
  }
  
  public void setPrecedence(Integer paramInteger) {
    this.precedence = paramInteger;
  }
  
  public List<DvsTrafficRule> getRules() {
    if (this.rules == null)
      this.rules = new ArrayList<>(); 
    return this.rules;
  }
}
