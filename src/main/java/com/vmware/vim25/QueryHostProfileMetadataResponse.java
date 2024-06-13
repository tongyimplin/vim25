package com.vmware.vim25;

import com.vmware.vim25.ProfileMetadata;
import com.vmware.vim25.QueryHostProfileMetadataResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryHostProfileMetadataResponse")
public class QueryHostProfileMetadataResponse {
  protected List<ProfileMetadata> returnval;
  
  public List<ProfileMetadata> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
