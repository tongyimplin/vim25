package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDatastoreSystemDatastoreResult;
import com.vmware.vim25.HostDatastoreSystemDatastoreResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDatastoreSystemDatastoreResult", propOrder = {"hostDatastoreSystemDatastoreResult"})
public class ArrayOfHostDatastoreSystemDatastoreResult {
  @XmlElement(name = "HostDatastoreSystemDatastoreResult")
  protected List<HostDatastoreSystemDatastoreResult> hostDatastoreSystemDatastoreResult;
  
  public List<HostDatastoreSystemDatastoreResult> getHostDatastoreSystemDatastoreResult() {
    if (this.hostDatastoreSystemDatastoreResult == null)
      this.hostDatastoreSystemDatastoreResult = new ArrayList<>(); 
    return this.hostDatastoreSystemDatastoreResult;
  }
}
