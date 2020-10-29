<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
</main>
<!-- END Main Container -->

<!-- Footer -->
<footer id="page-footer" class="opacity-0">
    <div class="content py-20 font-size-xs clearfix">
        <div class="float-right">
            Crafted with <i class="fa fa-heart text-pulse"></i> by <a class="font-w600" href="https://github.com/spqrwk/sdms" target="_blank">j347</a>
        </div>
        <div class="float-left">
            <a class="font-w600" href="https://github.com/spqrwk/sdms" target="_blank">SDMS</a> &copy; <span class="js-year-copy">2020</span>
        </div>
    </div>
</footer>
<!-- END Footer -->
</div>
<!-- END Page Container -->

<!--
Codebase JS Core

Vital libraries and plugins used in all pages. You can choose to not include this file if you would like
to handle those dependencies through webpack. Please check out ${realPath}/statics/assets/_es6/main/bootstrap.js for more info.

If you like, you could also include them separately directly from the ${realPath}/statics/assets/js/core folder in the following
order. That can come in handy if you would like to include a few of them (eg jQuery) from a CDN.

${realPath}/statics/assets/js/core/jquery.min.js
${realPath}/statics/assets/js/core/bootstrap.bundle.min.js
${realPath}/statics/assets/js/core/simplebar.min.js
${realPath}/statics/assets/js/core/jquery-scrollLock.min.js
${realPath}/statics/assets/js/core/jquery.appear.min.js
${realPath}/statics/assets/js/core/jquery.countTo.min.js
${realPath}/statics/assets/js/core/js.cookie.min.js
-->
<script src="${realPath}/statics/assets/js/codebase.core.min.js"></script>

<!--
Codebase JS

Custom functionality including Blocks/Layout API as well as other vital and optional helpers
webpack is putting everything together at ${realPath}/statics/assets/_es6/main/app.js
-->
<script src="${realPath}/statics/assets/js/codebase.app.min.js"></script>

<!-- Page JS Plugins -->
<script src="${realPath}/statics/assets/js/plugins/chartjs/Chart.bundle.min.js"></script>

<!-- Page JS Code -->
<script src="${realPath}/statics/assets/js/pages/be_pages_dashboard.min.js"></script>
<script src="${realPath}/statics/js/rollpage.js"></script>
</body>
</html>