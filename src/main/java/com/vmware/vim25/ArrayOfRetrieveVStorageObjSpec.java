package com.vmware.vim25;

import com.vmware.vim25.ArrayOfRetrieveVStorageObjSpec;
import com.vmware.vim25.RetrieveVStorageObjSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRetrieveVStorageObjSpec", propOrder = {"retrieveVStorageObjSpec"})
public class ArrayOfRetrieveVStorageObjSpec {
  @XmlElement(name = "RetrieveVStorageObjSpec")
  protected List<RetrieveVStorageObjSpec> retrieveVStorageObjSpec;
  
  public List<RetrieveVStorageObjSpec> getRetrieveVStorageObjSpec() {
    if (this.retrieveVStorageObjSpec == null)
      this.retrieveVStorageObjSpec = new ArrayList<>(); 
    return this.retrieveVStorageObjSpec;
  }
}
