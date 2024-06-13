package com.vmware.vim25;

import com.vmware.vim25.ListTagsAttachedToVStorageObjectResponse;
import com.vmware.vim25.VslmTagEntry;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ListTagsAttachedToVStorageObjectResponse")
public class ListTagsAttachedToVStorageObjectResponse {
  protected List<VslmTagEntry> returnval;
  
  public List<VslmTagEntry> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
