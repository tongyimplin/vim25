package com.vmware.vim25;

import com.vmware.vim25.ArrayOfStoragePerformanceSummary;
import com.vmware.vim25.StoragePerformanceSummary;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStoragePerformanceSummary", propOrder = {"storagePerformanceSummary"})
public class ArrayOfStoragePerformanceSummary {
  @XmlElement(name = "StoragePerformanceSummary")
  protected List<StoragePerformanceSummary> storagePerformanceSummary;
  
  public List<StoragePerformanceSummary> getStoragePerformanceSummary() {
    if (this.storagePerformanceSummary == null)
      this.storagePerformanceSummary = new ArrayList<>(); 
    return this.storagePerformanceSummary;
  }
}
