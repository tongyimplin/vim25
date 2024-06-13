package com.vmware.vim25;

import com.vmware.vim25.ID;
import com.vmware.vim25.ListVStorageObjectsAttachedToTagResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ListVStorageObjectsAttachedToTagResponse")
public class ListVStorageObjectsAttachedToTagResponse {
  protected List<ID> returnval;
  
  public List<ID> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
