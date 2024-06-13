package com.vmware.vim25;

import com.vmware.vim25.ClusterIoFilterInfo;
import com.vmware.vim25.QueryIoFilterInfoResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryIoFilterInfoResponse")
public class QueryIoFilterInfoResponse {
  protected List<ClusterIoFilterInfo> returnval;
  
  public List<ClusterIoFilterInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
