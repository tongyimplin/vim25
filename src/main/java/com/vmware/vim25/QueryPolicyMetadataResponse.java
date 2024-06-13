package com.vmware.vim25;

import com.vmware.vim25.ProfilePolicyMetadata;
import com.vmware.vim25.QueryPolicyMetadataResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryPolicyMetadataResponse")
public class QueryPolicyMetadataResponse {
  protected List<ProfilePolicyMetadata> returnval;
  
  public List<ProfilePolicyMetadata> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
