package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.TemplateUpgradeEvent;
import com.vmware.vim25.TemplateUpgradeFailedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateUpgradeFailedEvent", propOrder = {"reason"})
public class TemplateUpgradeFailedEvent extends TemplateUpgradeEvent {
  @XmlElement(required = true)
  protected LocalizedMethodFault reason;
  
  public LocalizedMethodFault getReason() {
    return this.reason;
  }
  
  public void setReason(LocalizedMethodFault paramLocalizedMethodFault) {
    this.reason = paramLocalizedMethodFault;
  }
}
