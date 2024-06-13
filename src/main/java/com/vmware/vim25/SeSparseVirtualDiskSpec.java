package com.vmware.vim25;

import com.vmware.vim25.FileBackedVirtualDiskSpec;
import com.vmware.vim25.SeSparseVirtualDiskSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeSparseVirtualDiskSpec", propOrder = {"grainSizeKb"})
public class SeSparseVirtualDiskSpec extends FileBackedVirtualDiskSpec {
  protected Integer grainSizeKb;
  
  public Integer getGrainSizeKb() {
    return this.grainSizeKb;
  }
  
  public void setGrainSizeKb(Integer paramInteger) {
    this.grainSizeKb = paramInteger;
  }
}
