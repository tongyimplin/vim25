package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsOutOfSyncHostArgument;
import com.vmware.vim25.DvsOutOfSyncHostArgument;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsOutOfSyncHostArgument", propOrder = {"dvsOutOfSyncHostArgument"})
public class ArrayOfDvsOutOfSyncHostArgument {
  @XmlElement(name = "DvsOutOfSyncHostArgument")
  protected List<DvsOutOfSyncHostArgument> dvsOutOfSyncHostArgument;
  
  public List<DvsOutOfSyncHostArgument> getDvsOutOfSyncHostArgument() {
    if (this.dvsOutOfSyncHostArgument == null)
      this.dvsOutOfSyncHostArgument = new ArrayList<>(); 
    return this.dvsOutOfSyncHostArgument;
  }
}
