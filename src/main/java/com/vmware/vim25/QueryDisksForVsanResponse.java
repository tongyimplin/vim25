package com.vmware.vim25;

import com.vmware.vim25.QueryDisksForVsanResponse;
import com.vmware.vim25.VsanHostDiskResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryDisksForVsanResponse")
public class QueryDisksForVsanResponse {
  protected List<VsanHostDiskResult> returnval;
  
  public List<VsanHostDiskResult> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
