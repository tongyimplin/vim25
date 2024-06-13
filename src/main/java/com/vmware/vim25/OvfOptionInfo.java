package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.OvfOptionInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfOptionInfo", propOrder = {"option", "description"})
public class OvfOptionInfo extends DynamicData {
  @XmlElement(required = true)
  protected String option;
  
  @XmlElement(required = true)
  protected LocalizableMessage description;
  
  public String getOption() {
    return this.option;
  }
  
  public void setOption(String paramString) {
    this.option = paramString;
  }
  
  public LocalizableMessage getDescription() {
    return this.description;
  }
  
  public void setDescription(LocalizableMessage paramLocalizableMessage) {
    this.description = paramLocalizableMessage;
  }
}
