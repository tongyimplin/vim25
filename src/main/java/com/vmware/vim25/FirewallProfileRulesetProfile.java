package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.FirewallProfileRulesetProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirewallProfileRulesetProfile", propOrder = {"key"})
public class FirewallProfileRulesetProfile extends ApplyProfile {
  @XmlElement(required = true)
  protected String key;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
}
