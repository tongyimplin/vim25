package com.vmware.vim25;

import com.vmware.vim25.AccountCreatedEvent;
import com.vmware.vim25.HostAccountSpec;
import com.vmware.vim25.HostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCreatedEvent", propOrder = {"spec", "group"})
public class AccountCreatedEvent extends HostEvent {
  @XmlElement(required = true)
  protected HostAccountSpec spec;
  
  protected boolean group;
  
  public HostAccountSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostAccountSpec paramHostAccountSpec) {
    this.spec = paramHostAccountSpec;
  }
  
  public boolean isGroup() {
    return this.group;
  }
  
  public void setGroup(boolean paramBoolean) {
    this.group = paramBoolean;
  }
}
