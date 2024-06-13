package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsOperationBulkFaultFaultOnHost;
import com.vmware.vim25.DvsOperationBulkFaultFaultOnHost;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsOperationBulkFaultFaultOnHost", propOrder = {"dvsOperationBulkFaultFaultOnHost"})
public class ArrayOfDvsOperationBulkFaultFaultOnHost {
  @XmlElement(name = "DvsOperationBulkFaultFaultOnHost")
  protected List<DvsOperationBulkFaultFaultOnHost> dvsOperationBulkFaultFaultOnHost;
  
  public List<DvsOperationBulkFaultFaultOnHost> getDvsOperationBulkFaultFaultOnHost() {
    if (this.dvsOperationBulkFaultFaultOnHost == null)
      this.dvsOperationBulkFaultFaultOnHost = new ArrayList<>(); 
    return this.dvsOperationBulkFaultFaultOnHost;
  }
}
