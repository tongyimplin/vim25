package com.vmware.vim25;

import com.vmware.vim25.Description;
import com.vmware.vim25.ExtendedDescription;
import com.vmware.vim25.KeyAnyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedDescription", propOrder = {"messageCatalogKeyPrefix", "messageArg"})
public class ExtendedDescription extends Description {
  @XmlElement(required = true)
  protected String messageCatalogKeyPrefix;
  
  protected List<KeyAnyValue> messageArg;
  
  public String getMessageCatalogKeyPrefix() {
    return this.messageCatalogKeyPrefix;
  }
  
  public void setMessageCatalogKeyPrefix(String paramString) {
    this.messageCatalogKeyPrefix = paramString;
  }
  
  public List<KeyAnyValue> getMessageArg() {
    if (this.messageArg == null)
      this.messageArg = new ArrayList<>(); 
    return this.messageArg;
  }
}
