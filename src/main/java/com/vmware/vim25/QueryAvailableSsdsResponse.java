package com.vmware.vim25;

import com.vmware.vim25.HostScsiDisk;
import com.vmware.vim25.QueryAvailableSsdsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryAvailableSsdsResponse")
public class QueryAvailableSsdsResponse {
  protected List<HostScsiDisk> returnval;
  
  public List<HostScsiDisk> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
