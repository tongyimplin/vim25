package com.vmware.vim25;

import com.vmware.vim25.ErrorUpgradeEvent;
import com.vmware.vim25.Event;
import com.vmware.vim25.InfoUpgradeEvent;
import com.vmware.vim25.UpgradeEvent;
import com.vmware.vim25.UserUpgradeEvent;
import com.vmware.vim25.WarningUpgradeEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeEvent", propOrder = {"message"})
@XmlSeeAlso({InfoUpgradeEvent.class, ErrorUpgradeEvent.class, WarningUpgradeEvent.class, UserUpgradeEvent.class})
public class UpgradeEvent extends Event {
  @XmlElement(required = true)
  protected String message;
  
  public String getMessage() {
    return this.message;
  }
  
  public void setMessage(String paramString) {
    this.message = paramString;
  }
}
