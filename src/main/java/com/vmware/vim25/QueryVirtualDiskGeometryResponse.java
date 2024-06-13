package com.vmware.vim25;

import com.vmware.vim25.HostDiskDimensionsChs;
import com.vmware.vim25.QueryVirtualDiskGeometryResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryVirtualDiskGeometryResponse")
public class QueryVirtualDiskGeometryResponse {
  @XmlElement(required = true)
  protected HostDiskDimensionsChs returnval;
  
  public HostDiskDimensionsChs getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostDiskDimensionsChs paramHostDiskDimensionsChs) {
    this.returnval = paramHostDiskDimensionsChs;
  }
}
