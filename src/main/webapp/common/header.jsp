<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    request.setAttribute("realPath", request.getContextPath());
%>
<!DOCTYPE html>
<html lang="en" class="no-focus">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">

    <title>学生宿舍管理系统</title>

    <meta name="description" content="Codebase - Bootstrap 4 Admin Template &amp; UI Framework created by pixelcave and published on Themeforest">
    <meta name="author" content="pixelcave">
    <meta name="robots" content="noindex, nofollow">

    <!-- Open Graph Meta -->
    <meta property="og:title" content="Codebase - Bootstrap 4 Admin Template &amp; UI Framework">
    <meta property="og:site_name" content="Codebase">
    <meta property="og:description" content="Codebase - Bootstrap 4 Admin Template &amp; UI Framework created by pixelcave and published on Themeforest">
    <meta property="og:type" content="website">
    <meta property="og:url" content="">
    <meta property="og:image" content="">

    <!-- Icons -->
    <!-- The following icons can be replaced with your own, they are used by desktop and mobile browsers -->
    <link rel="shortcut icon" href="${realPath}/statics/assets/media/favicons/favicon.png">
    <link rel="icon" type="image/png" sizes="192x192" href="${realPath}/statics/assets/media/favicons/favicon-192x192.png">
    <link rel="apple-touch-icon" sizes="180x180" href="${realPath}/statics/assets/media/favicons/apple-touch-icon-180x180.png">
    <!-- END Icons -->

    <!-- Stylesheets -->

    <!-- Fonts and Codebase framework -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Muli:300,400,400i,600,700">
    <link rel="stylesheet" href="${realPath}/statics/assets/js/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css">
    <link rel="stylesheet" id="css-main" href="${realPath}/statics/assets/css/codebase.min.css">

    <!-- You can include a specific file from css/themes/ folder to alter the default color theme of the template. eg: -->
    <!-- <link rel="stylesheet" id="css-theme" href="${realPath}/statics/assets/css/themes/flat.min.css"> -->
    <!-- END Stylesheets -->
</head>
<body>

<!-- Page Container -->
<!--
    Available classes for #page-container:

GENERIC

    'enable-cookies'                            Remembers active color theme between pages (when set through color theme helper Template._uiHandleTheme())

SIDEBAR & SIDE OVERLAY

    'sidebar-r'                                 Right Sidebar and left Side Overlay (default is left Sidebar and right Side Overlay)
    'sidebar-mini'                              Mini hoverable Sidebar (screen width > 991px)
    'sidebar-o'                                 Visible Sidebar by default (screen width > 991px)
    'sidebar-o-xs'                              Visible Sidebar by default (screen width < 992px)
    'sidebar-inverse'                           Dark themed sidebar

    'side-overlay-hover'                        Hoverable Side Overlay (screen width > 991px)
    'side-overlay-o'                            Visible Side Overlay by default

    'enable-page-overlay'                       Enables a visible clickable Page Overlay (closes Side Overlay on click) when Side Overlay opens

    'side-scroll'                               Enables custom scrolling on Sidebar and Side Overlay instead of native scrolling (screen width > 991px)

HEADER

    ''                                          Static Header if no class is added
    'page-header-fixed'                         Fixed Header

HEADER STYLE

    ''                                          Classic Header style if no class is added
    'page-header-modern'                        Modern Header style
    'page-header-inverse'                       Dark themed Header (works only with classic Header style)
    'page-header-glass'                         Light themed Header with transparency by default
                                                (absolute position, perfect for light images underneath - solid light background on scroll if the Header is also set as fixed)
    'page-header-glass page-header-inverse'     Dark themed Header with transparency by default
                                                (absolute position, perfect for dark images underneath - solid dark background on scroll if the Header is also set as fixed)

MAIN CONTENT LAYOUT

    ''                                          Full width Main Content if no class is added
    'main-content-boxed'                        Full width Main Content with a specific maximum width (screen width > 1200px)
    'main-content-narrow'                       Full width Main Content with a percentage width (screen width > 1200px)
-->
<div id="page-container" class="sidebar-mini sidebar-o sidebar-inverse enable-page-overlay side-scroll page-header-fixed page-header-glass page-header-inverse main-content-boxed">
    <!-- Side Overlay-->
    <%--    <aside id="side-overlay">--%>
    <%--        <!-- Side Header -->--%>
    <%--        <div class="content-header content-header-fullrow">--%>
    <%--            <div class="content-header-section align-parent">--%>
    <%--                <!-- Close Side Overlay -->--%>
    <%--                <!-- Layout API, functionality initialized in Template._uiApiLayout() -->--%>
    <%--                <button type="button" class="btn btn-circle btn-dual-secondary align-v-r" data-toggle="layout" data-action="side_overlay_close">--%>
    <%--                    <i class="fa fa-times text-danger"></i>--%>
    <%--                </button>--%>
    <%--                <!-- END Close Side Overlay -->--%>

    <%--                <!-- User Info -->--%>
    <%--                <div class="content-header-item">--%>
    <%--                    <a class="img-link mr-5" href="${realPath}/user/view">--%>
    <%--                        <img class="img-avatar img-avatar32" src="${realPath}/statics/assets/media/avatars/avatar15.jpg" alt="">--%>
    <%--                    </a>--%>
    <%--                    <a class="align-middle link-effect text-primary-dark font-w600" href="${realPath}/user/view">John Smith</a>--%>
    <%--                </div>--%>
    <%--                <!-- END User Info -->--%>
    <%--            </div>--%>
    <%--        </div>--%>
    <%--        <!-- END Side Header -->--%>

    <%--        <!-- Side Content -->--%>
    <%--        <div class="content-side">--%>

    <%--        </div>--%>
    <%--        <!-- END Side Content -->--%>
    <%--    </aside>--%>
    <!-- END Side Overlay -->

    <!-- Sidebar -->
    <!--
        Helper classes

        Adding .sidebar-mini-hide to an element will make it invisible (opacity: 0) when the sidebar is in mini mode
        Adding .sidebar-mini-show to an element will make it visible (opacity: 1) when the sidebar is in mini mode
            If you would like to disable the transition, just add the .sidebar-mini-notrans along with one of the previous 2 classes

        Adding .sidebar-mini-hidden to an element will hide it when the sidebar is in mini mode
        Adding .sidebar-mini-visible to an element will show it only when the sidebar is in mini mode
            - use .sidebar-mini-visible-b if you would like to be a block when visible (display: block)
    -->
    <nav id="sidebar">
        <!-- Sidebar Content -->
        <div class="sidebar-content">
            <!-- Side Header -->
            <div class="content-header content-header-fullrow px-15">
                <!-- Mini Mode -->
                <div class="content-header-section sidebar-mini-visible-b">
                    <!-- Logo -->
                    <span class="content-header-item font-w700 font-size-xl float-left animated fadeIn">
                                <span class="text-dual-primary-dark">D</span><span class="text-primary">M</span>
                            </span>
                    <!-- END Logo -->
                </div>
                <!-- END Mini Mode -->

                <!-- Normal Mode -->
                <div class="content-header-section text-center align-parent sidebar-mini-hidden">
                    <!-- Close Sidebar, Visible only on mobile screens -->
                    <!-- Layout API, functionality initialized in Template._uiApiLayout() -->
                    <button type="button" class="btn btn-circle btn-dual-secondary d-lg-none align-v-r" data-toggle="layout" data-action="sidebar_close">
                        <i class="fa fa-times text-danger"></i>
                    </button>
                    <!-- END Close Sidebar -->

                    <!-- Logo -->
                    <div class="content-header-item">
                        <a class="link-effect font-w700" href="${realPath}/main">
                            <i class="si si-fire text-primary"></i>
                            <span class="font-size-xl text-dual-primary-dark">SD</span><span class="font-size-xl text-primary">MS</span>
                        </a>
                    </div>
                    <!-- END Logo -->
                </div>
                <!-- END Normal Mode -->
            </div>
            <!-- END Side Header -->

            <!-- Side User -->
            <div class="content-side content-side-full content-side-user px-10 align-parent">
                <!-- Visible only in mini mode -->
                <div class="sidebar-mini-visible-b align-v animated fadeIn">
                    <img class="img-avatar img-avatar32" src="${realPath}/statics/assets/media/avatars/avatar15.jpg" alt="">
                </div>
                <!-- END Visible only in mini mode -->

                <!-- Visible only in normal mode -->
                <div class="sidebar-mini-hidden-b text-center">
                    <p class="img-link" >
                        <img class="img-avatar" src="${realPath}/statics/assets/media/avatars/avatar15.jpg" alt="">
                    </p>
                    <ul class="list-inline mt-10">
                        <li class="list-inline-item">
                            <p class="link-effect text-dual-primary-dark font-size-xs font-w600 text-uppercase">${loginUser.username}</p>
                        </li>
                        <li class="list-inline-item">
                            <!-- Layout API, functionality initialized in Template._uiApiLayout() -->
                            <p class="link-effect text-dual-primary-dark" data-toggle="layout" data-action="sidebar_style_inverse_toggle" href="javascript:void(0)">
                                <i class="si si-drop"></i>
                            </p>
                        </li>
                        <li class="list-inline-item">
                            <a class="link-effect text-dual-primary-dark" href="${realPath}/dologout">
                                <i class="si si-logout"></i>
                            </a>
                        </li>
                    </ul>
                </div>
                <!-- END Visible only in normal mode -->
            </div>
            <!-- END Side User -->

            <!-- Side Navigation -->
            <div class="content-side content-side-full">
                <ul class="nav-main">
                    <li>
                        <a href="${realPath}/main"><i class="si si-cup"></i><span class="sidebar-mini-hide">首页</span></a>
                    </li>
                    <li class="nav-main-heading"><span class="sidebar-mini-visible">功能</span><span class="sidebar-mini-hidden">功能</span></li>
                    <li>
                        <a class="nav-submenu" data-toggle="nav-submenu" href="#"><i class="si si-puzzle"></i><span class="sidebar-mini-hide">学生</span></a>
                        <ul>
                            <li>
                                <a href="${realPath}/stu/list">学生列表</a>
                            </li>
                            <li>
                                <a href="${realPath}/stu/add">添加学生</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a class="nav-submenu" data-toggle="nav-submenu" href="#"><i class="si si-moustache"></i><span class="sidebar-mini-hide">宿舍</span></a>
                        <ul>
                            <li>
                                <a href="${realPath}/dorm/list">宿舍列表</a>
                            </li>
                            <li>
                                <a href="${realPath}/dorm/add">添加宿舍</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a class="nav-submenu" data-toggle="nav-submenu" href="#"><i class="si si-energy"></i><span class="sidebar-mini-hide">班级</span></a>
                        <ul>
                            <li>
                                <a href="${realPath}/clazz/list">班级列表</a>
                            </li>
                            <li>
                                <a href="${realPath}/clazz/add">添加班级</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a class="nav-submenu" data-toggle="nav-submenu" href="#"><i class="si si-layers"></i><span class="sidebar-mini-hide">班主任</span></a>
                        <ul>
                            <li>
                                <a href="${realPath}/tch/list">班主任列表</a>
                            </li>
                            <li>
                                <a href="${realPath}/tch/add">添加班主任</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a class="nav-submenu" data-toggle="nav-submenu" href="#"><i class="si si-note"></i><span class="sidebar-mini-hide">用户管理</span></a>
                        <ul>
                            <li>
                                <a href="${realPath}/user/list">用户列表</a>
                            </li>
                            <li>
                                <a href="${realPath}/user/add">添加用户</a>
                            </li>
                            <li>
                                <a href="${realPath}/user/topwdupdate">修改密码</a>
                            </li>
                        </ul>
                    </li>

                </ul>
            </div>
            <!-- END Side Navigation -->
        </div>
        <!-- Sidebar Content -->
    </nav>
    <!-- END Sidebar -->

    <!-- Header -->
    <header id="page-header">
        <!-- Header Content -->
        <div class="content-header">
            <!-- Left Section -->
            <div class="content-header-section">
                <!-- Toggle Sidebar -->
                <!-- Layout API, functionality initialized in Template._uiApiLayout() -->
                <button type="button" class="btn btn-circle btn-dual-secondary" data-toggle="layout" data-action="sidebar_toggle">
                    <i class="fa fa-navicon"></i>
                </button>
                <!-- END Toggle Sidebar -->

                <!-- Layout Options (used just for demonstration) -->
                <!-- Layout API, functionality initialized in Template._uiApiLayout() -->
                <div class="btn-group" role="group">
                    <button type="button" class="btn btn-circle btn-dual-secondary" id="page-header-options-dropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fa fa-wrench"></i>
                    </button>
                    <div class="dropdown-menu min-width-300" aria-labelledby="page-header-options-dropdown">
                        <h5 class="h6 text-center py-10 mb-10 border-b text-uppercase">设置</h5>
                        <h6 class="dropdown-header">颜色主题</h6>
                        <div class="row no-gutters text-center mb-5">
                            <div class="col-2 mb-5">
                                <a class="text-default" data-toggle="theme" data-theme="default" href="javascript:void(0)">
                                    <i class="fa fa-2x fa-circle"></i>
                                </a>
                            </div>
                            <div class="col-2 mb-5">
                                <a class="text-elegance" data-toggle="theme" data-theme="${realPath}/statics/assets/css/themes/elegance.min.css" href="javascript:void(0)">
                                    <i class="fa fa-2x fa-circle"></i>
                                </a>
                            </div>
                            <div class="col-2 mb-5">
                                <a class="text-pulse" data-toggle="theme" data-theme="${realPath}/statics/assets/css/themes/pulse.min.css" href="javascript:void(0)">
                                    <i class="fa fa-2x fa-circle"></i>
                                </a>
                            </div>
                            <div class="col-2 mb-5">
                                <a class="text-flat" data-toggle="theme" data-theme="${realPath}/statics/assets/css/themes/flat.min.css" href="javascript:void(0)">
                                    <i class="fa fa-2x fa-circle"></i>
                                </a>
                            </div>
                            <div class="col-2 mb-5">
                                <a class="text-corporate" data-toggle="theme" data-theme="${realPath}/statics/assets/css/themes/corporate.min.css" href="javascript:void(0)">
                                    <i class="fa fa-2x fa-circle"></i>
                                </a>
                            </div>
                            <div class="col-2 mb-5">
                                <a class="text-earth" data-toggle="theme" data-theme="${realPath}/statics/assets/css/themes/earth.min.css" href="javascript:void(0)">
                                    <i class="fa fa-2x fa-circle"></i>
                                </a>
                            </div>
                        </div>
                        <h6 class="dropdown-header">侧边栏样式</h6>
                        <div class="row gutters-tiny text-center mb-5">
                            <div class="col-6">
                                <button type="button" class="btn btn-sm btn-block btn-alt-secondary mb-10" data-toggle="layout" data-action="sidebar_style_inverse_off">明亮</button>
                            </div>
                            <div class="col-6">
                                <button type="button" class="btn btn-sm btn-block btn-alt-secondary mb-10" data-toggle="layout" data-action="sidebar_style_inverse_on">黑暗</button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- END Layout Options -->
            </div>
            <!-- END Left Section -->

            <!-- Right Section -->
            <div class="content-header-section">
                <!-- User Dropdown -->
                <div class="btn-group" role="group">
                    <button type="button" class="btn btn-rounded btn-dual-secondary" id="page-header-user-dropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fa fa-user d-sm-none"></i>
                        <span class="d-none d-sm-inline-block">${loginUser.username}</span>
                        <i class="fa fa-angle-down ml-5"></i>
                    </button>
                    <div class="dropdown-menu dropdown-menu-right min-width-200" aria-labelledby="page-header-user-dropdown">
<%--
                        <h5 class="h6 text-center py-10 mb-5 border-b text-uppercase">User</h5>

                        <div class="dropdown-divider"></div>
--%>
                        <a class="dropdown-item" href="${realPath}/dologout">
                            <i class="si si-logout mr-5"></i> 退出登录
                        </a>
                    </div>
                </div>
                <!-- END User Dropdown -->



                <!-- Toggle Side Overlay -->
                <!-- Layout API, functionality initialized in Template._uiApiLayout() -->
                <%--                <button type="button" class="btn btn-circle btn-dual-secondary" data-toggle="layout" data-action="side_overlay_toggle">--%>
                <%--                    <i class="fa fa-tasks"></i>--%>
                <%--                </button>--%>
                <!-- END Toggle Side Overlay -->
            </div>
            <!-- END Right Section -->
        </div>
        <!-- END Header Content -->

        <!-- Header Search -->

        <!-- END Header Search -->

        <!-- Header Loader -->
        <!-- Please check out the Activity page under Elements category to see examples of showing/hiding it -->
        <div id="page-header-loader" class="overlay-header bg-primary">
            <div class="content-header content-header-fullrow text-center">
                <div class="content-header-item">
                    <i class="fa fa-sun-o fa-spin text-white"></i>
                </div>
            </div>
        </div>
        <!-- END Header Loader -->
    </header>
    <!-- END Header -->

    <!-- Main Container -->
    <main id="main-container">

        <!-- Hero -->
        <div class="bg-image bg-image-bottom" style="background-image: url('${realPath}/statics/assets/media/photos/photo34@2x.jpg');">
            <div class="bg-primary-dark-op">
                <div class="content content-top text-center overflow-hidden">
                    <div class="pt-50 pb-20">
                        <h1 class="font-w700 text-white mb-10 invisible" data-toggle="appear" data-class="animated fadeInUp">${loginUser.username}</h1>
                        <h2 class="h4 font-w400 text-white-op invisible" data-toggle="appear" data-class="animated fadeInUp">欢迎使用学生宿舍管理系统</h2>
                    </div>
                </div>
            </div>
        </div>
        <!-- END Hero -->
        <input type="hidden" id="path" name="path" value="${pageContext.request.contextPath}">
