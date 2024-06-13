package com.vmware.vim25;

import com.vmware.vim25.QueryVmfsDatastoreCreateOptionsResponse;
import com.vmware.vim25.VmfsDatastoreOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryVmfsDatastoreCreateOptionsResponse")
public class QueryVmfsDatastoreCreateOptionsResponse {
  protected List<VmfsDatastoreOption> returnval;
  
  public List<VmfsDatastoreOption> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
