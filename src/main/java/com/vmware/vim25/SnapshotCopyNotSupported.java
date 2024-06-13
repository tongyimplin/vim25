package com.vmware.vim25;

import com.vmware.vim25.HotSnapshotMoveNotSupported;
import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.SnapshotCloneNotSupported;
import com.vmware.vim25.SnapshotMoveFromNonHomeNotSupported;
import com.vmware.vim25.SnapshotMoveNotSupported;
import com.vmware.vim25.SnapshotMoveToNonHomeNotSupported;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotCopyNotSupported")
@XmlSeeAlso({SnapshotCloneNotSupported.class, SnapshotMoveFromNonHomeNotSupported.class, SnapshotMoveNotSupported.class, HotSnapshotMoveNotSupported.class, SnapshotMoveToNonHomeNotSupported.class})
public class SnapshotCopyNotSupported extends MigrationFault {}
