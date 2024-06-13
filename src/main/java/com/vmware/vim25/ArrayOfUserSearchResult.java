package com.vmware.vim25;

import com.vmware.vim25.ArrayOfUserSearchResult;
import com.vmware.vim25.UserSearchResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserSearchResult", propOrder = {"userSearchResult"})
public class ArrayOfUserSearchResult {
  @XmlElement(name = "UserSearchResult")
  protected List<UserSearchResult> userSearchResult;
  
  public List<UserSearchResult> getUserSearchResult() {
    if (this.userSearchResult == null)
      this.userSearchResult = new ArrayList<>(); 
    return this.userSearchResult;
  }
}
