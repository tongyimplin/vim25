package com.vmware.vim25;

import com.vmware.vim25.QueryVmfsDatastoreExpandOptionsResponse;
import com.vmware.vim25.VmfsDatastoreOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryVmfsDatastoreExpandOptionsResponse")
public class QueryVmfsDatastoreExpandOptionsResponse {
  protected List<VmfsDatastoreOption> returnval;
  
  public List<VmfsDatastoreOption> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
