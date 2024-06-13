package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FileQuery;
import com.vmware.vim25.FileQueryFlags;
import com.vmware.vim25.HostDatastoreBrowserSearchSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDatastoreBrowserSearchSpec", propOrder = {"query", "details", "searchCaseInsensitive", "matchPattern", "sortFoldersFirst"})
public class HostDatastoreBrowserSearchSpec extends DynamicData {
  protected List<FileQuery> query;
  
  protected FileQueryFlags details;
  
  protected Boolean searchCaseInsensitive;
  
  protected List<String> matchPattern;
  
  protected Boolean sortFoldersFirst;
  
  public List<FileQuery> getQuery() {
    if (this.query == null)
      this.query = new ArrayList<>(); 
    return this.query;
  }
  
  public FileQueryFlags getDetails() {
    return this.details;
  }
  
  public void setDetails(FileQueryFlags paramFileQueryFlags) {
    this.details = paramFileQueryFlags;
  }
  
  public Boolean isSearchCaseInsensitive() {
    return this.searchCaseInsensitive;
  }
  
  public void setSearchCaseInsensitive(Boolean paramBoolean) {
    this.searchCaseInsensitive = paramBoolean;
  }
  
  public List<String> getMatchPattern() {
    if (this.matchPattern == null)
      this.matchPattern = new ArrayList<>(); 
    return this.matchPattern;
  }
  
  public Boolean isSortFoldersFirst() {
    return this.sortFoldersFirst;
  }
  
  public void setSortFoldersFirst(Boolean paramBoolean) {
    this.sortFoldersFirst = paramBoolean;
  }
}
