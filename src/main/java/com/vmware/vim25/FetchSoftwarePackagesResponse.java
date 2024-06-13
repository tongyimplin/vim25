package com.vmware.vim25;

import com.vmware.vim25.FetchSoftwarePackagesResponse;
import com.vmware.vim25.SoftwarePackage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "fetchSoftwarePackagesResponse")
public class FetchSoftwarePackagesResponse {
  protected List<SoftwarePackage> returnval;
  
  public List<SoftwarePackage> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
