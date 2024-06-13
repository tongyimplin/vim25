package com.vmware.vim25;

import com.vmware.vim25.DesiredSoftwareSpecBaseImageSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesiredSoftwareSpecBaseImageSpec", propOrder = {"version"})
public class DesiredSoftwareSpecBaseImageSpec extends DynamicData {
  @XmlElement(required = true)
  protected String version;
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
}
