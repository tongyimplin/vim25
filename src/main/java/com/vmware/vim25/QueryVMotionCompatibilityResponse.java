package com.vmware.vim25;

import com.vmware.vim25.HostVMotionCompatibility;
import com.vmware.vim25.QueryVMotionCompatibilityResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryVMotionCompatibilityResponse")
public class QueryVMotionCompatibilityResponse {
  protected List<HostVMotionCompatibility> returnval;
  
  public List<HostVMotionCompatibility> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
