package com.vmware.vim25;

import com.vmware.vim25.OvfExport;
import com.vmware.vim25.OvfPropertyExport;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfPropertyExport", propOrder = {"type", "value"})
public class OvfPropertyExport extends OvfExport {
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected String value;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
