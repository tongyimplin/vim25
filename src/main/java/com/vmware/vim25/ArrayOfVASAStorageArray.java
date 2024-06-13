package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVASAStorageArray;
import com.vmware.vim25.VASAStorageArray;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVASAStorageArray", propOrder = {"vasaStorageArray"})
public class ArrayOfVASAStorageArray {
  @XmlElement(name = "VASAStorageArray")
  protected List<VASAStorageArray> vasaStorageArray;
  
  public List<VASAStorageArray> getVASAStorageArray() {
    if (this.vasaStorageArray == null)
      this.vasaStorageArray = new ArrayList<>(); 
    return this.vasaStorageArray;
  }
}
