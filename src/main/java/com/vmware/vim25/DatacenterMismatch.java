package com.vmware.vim25;

import com.vmware.vim25.DatacenterMismatch;
import com.vmware.vim25.DatacenterMismatchArgument;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MigrationFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatacenterMismatch", propOrder = {"invalidArgument", "expectedDatacenter"})
public class DatacenterMismatch extends MigrationFault {
  @XmlElement(required = true)
  protected List<DatacenterMismatchArgument> invalidArgument;
  
  @XmlElement(required = true)
  protected ManagedObjectReference expectedDatacenter;
  
  public List<DatacenterMismatchArgument> getInvalidArgument() {
    if (this.invalidArgument == null)
      this.invalidArgument = new ArrayList<>(); 
    return this.invalidArgument;
  }
  
  public ManagedObjectReference getExpectedDatacenter() {
    return this.expectedDatacenter;
  }
  
  public void setExpectedDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.expectedDatacenter = paramManagedObjectReference;
  }
}
