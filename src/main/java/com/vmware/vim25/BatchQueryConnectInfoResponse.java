package com.vmware.vim25;

import com.vmware.vim25.BatchQueryConnectInfoResponse;
import com.vmware.vim25.DatacenterBasicConnectInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "BatchQueryConnectInfoResponse")
public class BatchQueryConnectInfoResponse {
  protected List<DatacenterBasicConnectInfo> returnval;
  
  public List<DatacenterBasicConnectInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
