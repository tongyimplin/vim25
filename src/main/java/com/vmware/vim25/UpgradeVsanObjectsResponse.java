package com.vmware.vim25;

import com.vmware.vim25.HostVsanInternalSystemVsanObjectOperationResult;
import com.vmware.vim25.UpgradeVsanObjectsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "UpgradeVsanObjectsResponse")
public class UpgradeVsanObjectsResponse {
  protected List<HostVsanInternalSystemVsanObjectOperationResult> returnval;
  
  public List<HostVsanInternalSystemVsanObjectOperationResult> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
