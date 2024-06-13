package com.vmware.vim25;

import com.vmware.vim25.OvfProperty;
import com.vmware.vim25.OvfPropertyQualifier;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfPropertyQualifier", propOrder = {"qualifier"})
public class OvfPropertyQualifier extends OvfProperty {
  @XmlElement(required = true)
  protected String qualifier;
  
  public String getQualifier() {
    return this.qualifier;
  }
  
  public void setQualifier(String paramString) {
    this.qualifier = paramString;
  }
}
