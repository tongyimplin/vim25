package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.OvfConsumerOvfSection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerOvfSection", propOrder = {"lineNumber", "xml"})
public class OvfConsumerOvfSection extends DynamicData {
  protected int lineNumber;
  
  @XmlElement(required = true)
  protected String xml;
  
  public int getLineNumber() {
    return this.lineNumber;
  }
  
  public void setLineNumber(int paramInt) {
    this.lineNumber = paramInt;
  }
  
  public String getXml() {
    return this.xml;
  }
  
  public void setXml(String paramString) {
    this.xml = paramString;
  }
}
