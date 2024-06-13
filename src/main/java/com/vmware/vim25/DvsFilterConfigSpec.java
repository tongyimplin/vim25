package com.vmware.vim25;

import com.vmware.vim25.DvsFilterConfig;
import com.vmware.vim25.DvsFilterConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsFilterConfigSpec", propOrder = {"operation"})
public class DvsFilterConfigSpec extends DvsFilterConfig {
  @XmlElement(required = true)
  protected String operation;
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
}
