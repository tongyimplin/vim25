package com.vmware.vim25;

import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.ExtendedElementDescription;
import com.vmware.vim25.KeyAnyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedElementDescription", propOrder = {"messageCatalogKeyPrefix", "messageArg"})
public class ExtendedElementDescription extends ElementDescription {
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
