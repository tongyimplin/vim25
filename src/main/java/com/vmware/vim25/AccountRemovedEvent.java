package com.vmware.vim25;

import com.vmware.vim25.AccountRemovedEvent;
import com.vmware.vim25.HostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountRemovedEvent", propOrder = {"account", "group"})
public class AccountRemovedEvent extends HostEvent {
  @XmlElement(required = true)
  protected String account;
  
  protected boolean group;
  
  public String getAccount() {
    return this.account;
  }
  
  public void setAccount(String paramString) {
    this.account = paramString;
  }
  
  public boolean isGroup() {
    return this.group;
  }
  
  public void setGroup(boolean paramBoolean) {
    this.group = paramBoolean;
  }
}
