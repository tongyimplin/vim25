package com.vmware.vim25;

import com.vmware.vim25.HostRetrieveVStorageObjectMetadataResponse;
import com.vmware.vim25.KeyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "HostRetrieveVStorageObjectMetadataResponse")
public class HostRetrieveVStorageObjectMetadataResponse {
  protected List<KeyValue> returnval;
  
  public List<KeyValue> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
