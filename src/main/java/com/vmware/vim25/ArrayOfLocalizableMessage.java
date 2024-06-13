package com.vmware.vim25;

import com.vmware.vim25.ArrayOfLocalizableMessage;
import com.vmware.vim25.LocalizableMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocalizableMessage", propOrder = {"localizableMessage"})
public class ArrayOfLocalizableMessage {
  @XmlElement(name = "LocalizableMessage")
  protected List<LocalizableMessage> localizableMessage;
  
  public List<LocalizableMessage> getLocalizableMessage() {
    if (this.localizableMessage == null)
      this.localizableMessage = new ArrayList<>(); 
    return this.localizableMessage;
  }
}
