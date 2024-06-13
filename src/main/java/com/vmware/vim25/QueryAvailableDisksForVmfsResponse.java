package com.vmware.vim25;

import com.vmware.vim25.HostScsiDisk;
import com.vmware.vim25.QueryAvailableDisksForVmfsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryAvailableDisksForVmfsResponse")
public class QueryAvailableDisksForVmfsResponse {
  protected List<HostScsiDisk> returnval;
  
  public List<HostScsiDisk> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
