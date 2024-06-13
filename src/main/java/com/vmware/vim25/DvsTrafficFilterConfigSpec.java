package com.vmware.vim25;

import com.vmware.vim25.DvsTrafficFilterConfig;
import com.vmware.vim25.DvsTrafficFilterConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsTrafficFilterConfigSpec", propOrder = {"operation"})
public class DvsTrafficFilterConfigSpec extends DvsTrafficFilterConfig {
  @XmlElement(required = true)
  protected String operation;
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
}
