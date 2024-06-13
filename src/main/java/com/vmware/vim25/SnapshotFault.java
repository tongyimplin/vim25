package com.vmware.vim25;

import com.vmware.vim25.ApplicationQuiesceFault;
import com.vmware.vim25.FilesystemQuiesceFault;
import com.vmware.vim25.MemorySnapshotOnIndependentDisk;
import com.vmware.vim25.MultipleSnapshotsNotSupported;
import com.vmware.vim25.SnapshotDisabled;
import com.vmware.vim25.SnapshotIncompatibleDeviceInVm;
import com.vmware.vim25.SnapshotLocked;
import com.vmware.vim25.SnapshotNoChange;
import com.vmware.vim25.TooManySnapshotLevels;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotFault")
@XmlSeeAlso({MemorySnapshotOnIndependentDisk.class, MultipleSnapshotsNotSupported.class, ApplicationQuiesceFault.class, SnapshotDisabled.class, TooManySnapshotLevels.class, SnapshotNoChange.class, SnapshotIncompatibleDeviceInVm.class, FilesystemQuiesceFault.class, SnapshotLocked.class})
public class SnapshotFault extends VimFault {}
