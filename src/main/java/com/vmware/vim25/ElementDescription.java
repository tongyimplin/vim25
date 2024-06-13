package com.vmware.vim25;

import com.vmware.vim25.Description;
import com.vmware.vim25.EVCMode;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.ExtendedElementDescription;
import com.vmware.vim25.OptionDef;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementDescription", propOrder = {"key"})
@XmlSeeAlso({ExtendedElementDescription.class, EVCMode.class, OptionDef.class})
public class ElementDescription extends Description {
  @XmlElement(required = true)
  protected String key;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
}
